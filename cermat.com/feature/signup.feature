Feature: Sign up member

Scenario: Adding new member
Given Launch browser
And Open url "https://www.cermati.com/app/gabung"
And enter the required information
When Click on Daftar button
Then We can view the verification methods "Pilih Metode Verifikasi"
And close browser