import {Component, inject} from '@angular/core';
import {LayoutAuthComponent} from '../layout-auth/layout-auth.component';
import {FormsModule, NgForm} from '@angular/forms';
import {LoginModel, UserRegister} from '../../../app/model/user.model';
import {Router} from '@angular/router';
import {UserService} from '../../../app/services/user.service';

@Component({
  selector: 'app-login',
  imports: [
    LayoutAuthComponent,
    FormsModule
  ],
  templateUrl: './login.component.html',
  standalone: true,
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  router = inject(Router);

  userService = inject(UserService);

  isLoginFormDisplayed = true;

  // login(value:NgForm) {
  //   console.log(value);
  //
  // }

  onLogin(value:LoginModel) {
    this.userService.onLogin(value).subscribe((res:UserRegister) => {
      alert("User Form, navigating inside");
      localStorage.setItem('logData', JSON.stringify(res));
      this.router.navigateByUrl("/dashboard")
    }, error => {
      alert("Wrong username or password");
    })
  }

  onRegister(value:UserRegister) {
    this.userService.registerUser(value).subscribe((res:UserRegister) => {
      alert("User Registration success")
    }, error => {
      alert(error.error);
    })
  }

  switchForm() {
    this.isLoginFormDisplayed = !this.isLoginFormDisplayed;
  }
}
