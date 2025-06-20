export class UserRegister {
  userId: number;
  emailId: string;
  fullName: string;
  password: string;

  constructor() {
    this.userId = 0;
    this.emailId = '';
    this.fullName = '';
    this.password = '';
  }
}

export class LoginModel {
  emailId: string;
  password: string;

  constructor() {
    this.emailId = '';
    this.password = '';
  }
}
