import {Routes} from '@angular/router';

import {LayoutAuthComponent} from '../components/auth/layout-auth/layout-auth.component';
import {LoginComponent} from '../components/auth/login/login.component';
import {LayoutComponent} from '../components/containers/layout/layout.component';
import {AreaChartComponent} from '../components/dashboard/area-chart/area-chart.component';
import {EmployeesComponent} from './components/employees/employees.component';

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
    path: 'employees',
    component: EmployeesComponent,
  },
  {
    path: '',
    component: LayoutComponent,
    children: [
      {
        path: 'dashboard',
        component: AreaChartComponent
      }
    ]
  }

];
