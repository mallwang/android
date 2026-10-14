import { beforeEach, describe, expect, it } from 'vitest';
import { FavoriteService } from './favorite.service';

describe('FavoriteService', () => {
  const service = new FavoriteService();

  beforeEach(() => localStorage.clear());

  it('starts empty', async () => {
    expect(await service.getAll()).toEqual([]);
  });

  it('adds without duplicates and removes only the given film', async () => {
    await service.set('1', true);
    await service.set('2', true);
    await service.set('2', true);
    expect(await service.getAll()).toEqual(['1', '2']);

    await service.set('1', false);
    expect(await service.getAll()).toEqual(['2']);
    expect(await service.isFavorite('1')).toBe(false);
  });

  it('ignores removing a film that is not a favorite', async () => {
    await service.set('1', true);
    await service.set('3', false); // legacy removed the last entry here (indexOf -1)
    expect(await service.getAll()).toEqual(['1']);
  });
});
