export interface IEmployee {
  employeeNumber: number,
  lastName: string,
  firstName: string,
  extension: string,
  email: string,
  officeCode: string,
  reportsTo: number,
  jobTitle: string
}

export interface IAmountByPaymentDate {
  paymentDate: string,
  amount: number
}
