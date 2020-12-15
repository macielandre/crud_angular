import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RestaurantItem } from '../interfaces/restaurant-item.interface';

@Injectable()

export class ListResultService {

    private root_url: string = 'localhost:8080/restaurants'

    constructor(private http: HttpClient) { }

    getLista(): Observable<RestaurantItem[]> {
        return this.http.get<RestaurantItem[]>(`${this.root_url}/list`);
    }
}
