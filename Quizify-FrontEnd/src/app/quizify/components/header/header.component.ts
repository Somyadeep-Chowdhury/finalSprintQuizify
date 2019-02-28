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
  constructor() { }

  ngOnInit() {
  }
<<<<<<< HEAD

  // search(value) {
  //   this.searchService.searchByTopicStartsWith(value).subscribe((res: any) => {
  //     this.games = res.body[0].game;
  //     console.log(this.games);
  //   });
  // }
=======
>>>>>>> 72823d5b578017e0998e442e9220ea1595cee47a
}
