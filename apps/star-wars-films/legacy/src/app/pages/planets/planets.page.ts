import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
import {ApiService} from '../../services/api.service';

@Component({
  selector: 'app-planets',
  templateUrl: './planets.page.html',
  styleUrls: ['./planets.page.scss']
})
export class PlanetsPage implements OnInit {
  public planets: Observable<any>;

  public constructor(private router: Router, private api: ApiService) {}

  public ngOnInit(): void {
    this.planets = this.api.getPlanets();
  }
}
