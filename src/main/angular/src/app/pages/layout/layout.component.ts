import {Component, inject} from '@angular/core';
import {Router, RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-layout',
  imports: [RouterOutlet],
  templateUrl: './layout.component.html',
  standalone: true,
  styleUrl: './layout.component.scss'
})
export class LayoutComponent {

  router = inject(Router)

  onLogOff() {
    localStorage.removeItem('logData')
    this.router.navigateByUrl('/login')
  }
}
