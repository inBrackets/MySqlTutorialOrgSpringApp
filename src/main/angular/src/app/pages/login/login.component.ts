import {Component} from '@angular/core';
import {NgClass} from '@angular/common';
import {UserRegister} from '../../model/user.model';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [NgClass, FormsModule],
  templateUrl: './login.component.html',
  standalone: true,
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  activeForm: string = "Login";

  registerObj: UserRegister = new UserRegister();
  changeView(formName: string) {
    this.activeForm = formName;
  }
}
