import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {Observable} from 'rxjs';
import {ApiService} from '../../services/api.service';

@Component({
  selector: 'app-films',
  templateUrl: './films.page.html',
  styleUrls: ['./films.page.scss']
})
export class FilmsPage implements OnInit {
  public films: Observable<any>;

  public constructor(private router: Router, private api: ApiService) {}

  public ngOnInit(): void {
    this.films = this.api.getFilms();
  }

  public openDetails(film: any): void {
    const split = film.url.split('/');
    const filmId = split[split.length - 2];
    this.router.navigateByUrl(`/tabs/films/${filmId}`);
  }
}
