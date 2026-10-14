import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {Router} from '@angular/router';
import {ApiService} from '../../services/api.service';

@Component({
  selector: 'app-people',
  templateUrl: './people.page.html',
  styleUrls: ['./people.page.scss']
})
export class PeoplePage implements OnInit {
  public people: Observable<any>;

  public constructor(private router: Router, private api: ApiService) {}

  public ngOnInit(): void {
    this.people = this.api.getPeople();
  }
}
