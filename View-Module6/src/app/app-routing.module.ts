import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {IndexComponent} from './component/index/index.component';
import {ListComponent} from './component/list/list.component';
import {DetailComponent} from './component/detail/detail.component';
import {LoginRegComponent} from './component/login-reg/login-reg.component';
import {CreateComponent} from './component/create/create.component';

const routes: Routes = [
  {
    path: '',
    component: IndexComponent,
  },
  {
    path: 'list',
    component: ListComponent,
  },
  {
    path: 'detail',
    component: DetailComponent,
  },
  {
    path: 'login',
    component: LoginRegComponent,
  },
  {
    path: 'create',
    component: CreateComponent,
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
