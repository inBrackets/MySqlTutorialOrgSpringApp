import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {UserRegister} from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }

  registerUser(obj: UserRegister) {
    this.http.post("https://api.freeprojectapi.com/api/UserApp/CreateNewUser", obj)
  }
}
