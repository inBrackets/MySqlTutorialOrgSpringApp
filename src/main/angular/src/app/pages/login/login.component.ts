import { Component } from '@angular/core';
import {NgClass} from '@angular/common';

@Component({
  selector: 'app-login',
  imports: [NgClass],
  templateUrl: './login.component.html',
  standalone: true,
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  activeForm: string = "Login";
  changeView(formName: string) {
    this.activeForm = formName;
  }
}
