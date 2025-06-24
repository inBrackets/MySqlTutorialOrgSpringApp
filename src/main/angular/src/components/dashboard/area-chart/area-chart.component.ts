import {Component, AfterViewInit, ViewChild, ElementRef, inject} from '@angular/core';
import { Chart, registerables } from 'chart.js';
import {IAmountByPaymentDate, IEmployee} from '../../../app/model/interface';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-area-chart',
  templateUrl: './area-chart.component.html',
  standalone: true,
  styleUrls: ['./area-chart.component.scss'],
  imports: []
})
export class AreaChartComponent implements AfterViewInit {
  @ViewChild('myAreaChart') myAreaChart!: ElementRef<HTMLCanvasElement>;
  chart!: Chart;

  http = inject(HttpClient);
  amountByPaymentList: IAmountByPaymentDate[] = [];

  constructor() {
    Chart.register(...registerables); // Register all Chart.js components
  }

  getAllPayments(){
    this.http.get<IAmountByPaymentDate[]>("http://localhost:8080/payments/AmountByDate").subscribe((response:any) => {
      this.amountByPaymentList = response;
    })
  }

  ngAfterViewInit(): void {
    this.http.get<IAmountByPaymentDate[]>("http://localhost:8080/payments/AmountByDate")
      .subscribe((response: IAmountByPaymentDate[]) => {
        this.amountByPaymentList = response;
        const labels = this.amountByPaymentList.map(item => item.paymentDate);
        const data = this.amountByPaymentList.map(item => {
          // @ts-ignore
          return parseFloat(item.amount);
        });

        this.chart = new Chart(this.myAreaChart.nativeElement, {
          type: 'line',
          data: {
            labels: labels,
            datasets: [
              {
                label: 'Payments by Date',
                backgroundColor: 'rgba(2,117,216,0.2)',
                borderColor: 'rgba(2,117,216,1)',
                pointRadius: 5,
                pointBackgroundColor: 'rgba(2,117,216,1)',
                pointBorderColor: 'rgba(255,255,255,0.8)',
                pointHoverRadius: 5,
                pointHoverBackgroundColor: 'rgba(2,117,216,1)',
                pointHitRadius: 50,
                pointBorderWidth: 2,
                data: data,
              },
            ],
          },
          options: {
            scales: {
              x: {
                type: 'category',
                grid: {
                  display: false,
                },
                ticks: {
                  maxTicksLimit: 7,
                },
              },
              y: {
                min: 0,
                max: 170000,
                ticks: {
                  maxTicksLimit: 5,
                },
                grid: {
                  color: 'rgba(0, 0, 0, 0.125)',
                },
              },
            },
            plugins: {
              legend: {
                display: false,
              },
            },
          },
        });
      })


  }
}
