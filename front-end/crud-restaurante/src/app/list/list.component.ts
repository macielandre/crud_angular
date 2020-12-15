import { Component, OnInit } from '@angular/core';
import { ListResultService } from '../services/listResultService';
import { RestaurantItem } from '../interfaces/restaurant-item.interface';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  oi: number=12
  items: RestaurantItem[]=[]

  constructor( private api: ListResultService ) { }

  ngOnInit(): void {
    this.getList()
  }

  getList(): void{
    this.api.getLista().subscribe({
      next: items => {
        this.items=items
      }
    })
  }
}
