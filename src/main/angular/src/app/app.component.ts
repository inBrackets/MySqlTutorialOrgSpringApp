import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {EmployeesComponent} from './components/employees/employees.component';
import {LoginComponent} from '../modules/login/login.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    EmployeesComponent,
    LoginComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'angular';
}
