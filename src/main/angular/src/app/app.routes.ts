import {Routes} from '@angular/router';

import {LayoutAuthComponent} from '../components/auth/layout-auth/layout-auth.component';
import {LoginComponent} from '../components/auth/login/login.component';
import {LayoutComponent} from '../components/temp/layout/layout.component';
import {DashboardComponent} from '../components/temp/dashboard/dashboard.component';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  {
    path: '',
    component: LayoutAuthComponent,
    children: [
      {
        path: 'login',
        component: LoginComponent
      },
    ]
  },
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'dashboard',
        component: DashboardComponent
      }
    ]
  }

];
