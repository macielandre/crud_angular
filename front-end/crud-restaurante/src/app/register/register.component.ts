import { Component, OnInit } from '@angular/core';
import { ListResultService } from '../services/listResultService';
import { RestaurantItem } from '../interfaces/restaurant-item.interface';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {

  items: RestaurantItem[]=[];

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
