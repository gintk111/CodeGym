import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { NavComponent } from './component/nav/nav.component';
import { FooterComponent } from './component/footer/footer.component';
import { IndexComponent } from './component/index/index.component';
import { AppRoutingModule } from './app-routing.module';
import { ListComponent } from './component/list/list.component';
import { DetailComponent } from './component/detail/detail.component';
import { LoginRegComponent } from './component/login-reg/login-reg.component';
import { CreateComponent } from './component/create/create.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavComponent,
    FooterComponent,
    IndexComponent,
    ListComponent,
    DetailComponent,
    LoginRegComponent,
    CreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
