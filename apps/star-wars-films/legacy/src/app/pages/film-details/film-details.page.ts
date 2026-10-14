import {FavoriteService} from '../../services/favorite.service';
import {ApiService} from '../../services/api.service';
import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {EmailComposer} from '@ionic-native/email-composer/ngx';

@Component({
  selector: 'app-film-details',
  templateUrl: './film-details.page.html',
  styleUrls: ['./film-details.page.scss']
})
export class FilmDetailsPage implements OnInit {
  public film: any;
  public isFavorite = false;
  private filmId = null;

  public constructor(
    private activatedRoute: ActivatedRoute,
    private api: ApiService,
    private emailComposer: EmailComposer,
    private favoriteService: FavoriteService
  ) {}

  public ngOnInit(): void {
    this.filmId = this.activatedRoute.snapshot.paramMap.get('id');

    this.api.getFilm(this.filmId).subscribe((res) => {
      this.film = res;
    });

    this.favoriteService.isFavorite(this.filmId).then((isFav) => {
      this.isFavorite = isFav;
    });
  }

  public favoriteFilm(): void {
    this.favoriteService.favoriteFilm(this.filmId).then(() => {
      this.isFavorite = true;
    });
  }

  public unfavoriteFilm(): void {
    this.favoriteService.unfavoriteFilm(this.filmId).then(() => {
      this.isFavorite = false;
    });
  }

  public shareFilm(): void {
    const email = {
      to: 'markus.allwang@tuta.io',
      subject: 'I love this one: ' + this.film.title,
      body: 'Can you remember the opening?<br><br>"' + this.film.opening_crawl + '"',
      isHtml: true
    };

    this.emailComposer.open(email);
  }
}
