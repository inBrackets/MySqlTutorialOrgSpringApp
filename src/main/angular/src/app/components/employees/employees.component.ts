import {Component, inject, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {IEmployee} from '../../model/interface';

@Component({
  selector: 'app-employees',
  standalone: true,
  imports: [],
  templateUrl: './employees.component.html',
  styleUrl: './employees.component.scss'
})
export class EmployeesComponent implements OnInit{

  version: number = 19;
  roleList: IEmployee[] = [];

  http = inject(HttpClient);

  showMessage(message: string): void {
    alert(message);
  };

  ngOnInit(): void {
    this.getAllEmployees();
  }

  getAllEmployees(){
    this.http.get<IEmployee[]>("http://localhost:8080/employees").subscribe((response:any) => {
      this.roleList = response;
    })
  }

}
