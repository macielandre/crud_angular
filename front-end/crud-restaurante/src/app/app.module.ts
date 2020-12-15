import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { HudComponent } from './hud/hud.component';
import { ListComponent } from './list/list.component';
import { DeleteComponent } from './delete/delete.component';
import { ListResultService } from './services/listResultService';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    HudComponent,
    ListComponent,
    DeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    ListResultService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
