import {Component, inject} from '@angular/core';
import {FooterComponent} from '../../containers/footer/footer.component';
import {Router, RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-layout-auth',
  imports: [FooterComponent, RouterOutlet],
  templateUrl: './layout-auth.component.html',
  standalone: true,
  styleUrl: './layout-auth.component.scss'
})
export class LayoutAuthComponent {

  router = inject(Router)
}
