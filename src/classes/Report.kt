package classes

import interfaces.Printable

class Report {
    fun generateReport(account: Printable){
        account.showData();
    }
}