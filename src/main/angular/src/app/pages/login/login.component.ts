import {Component, inject} from '@angular/core';
import {NgClass} from '@angular/common';
import {LoginModel, UserRegister} from '../../model/user.model';
import {FormsModule} from '@angular/forms';
import {UserService} from '../../services/user.service';

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
  loginObj: LoginModel = new LoginModel();

  userService = inject(UserService);

  changeView(formName: string) {
    this.activeForm = formName;
  }

  onRegister() {
    this.userService.registerUser(this.registerObj).subscribe((res:UserRegister) => {
      alert("User Registration success")
    }, error => {
      alert(error.error);
    })
  }

  onLogin() {
    this.userService.onLogin(this.loginObj).subscribe((res:UserRegister) => {
      alert("User Form, navigating inside")
    }, error => {
      alert(error.error);
    })
  }
}
