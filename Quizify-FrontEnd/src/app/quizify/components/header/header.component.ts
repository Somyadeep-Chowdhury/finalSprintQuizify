import { Component, OnInit } from '@angular/core';
import { SearchService } from '../../services/search.service';
import { Gamesearch } from '../../tsclasses/gamesearch';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  private games: Gamesearch[];
  constructor(private searchService: SearchService) { }

  ngOnInit() {
  }
}
