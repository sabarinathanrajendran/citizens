package org.test.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass()
	{
		PageFactory.initElements(driver,this);
	}
	//To sign
	@FindBy(xpath="//a[@class=\"login\"]")
	private WebElement sigin ;
	//To enter  mail
	@FindBy(xpath="//input[@id=\"email_create\"]")
	private WebElement emailAddress;
	//To click the account
	@FindBy(id="SubmitCreate")
	private WebElement CreateAccount;
    //To enter the Title
	@FindBy(xpath="//input[@id='id_gender1']")
	private WebElement gender;
	//To enter firstname
	@FindBy(id="customer_firstname")
	private WebElement firstName;
	//To enter the LastName
	@FindBy(id="customer_lastname")
	private WebElement lastName;
	//To enter the email
	@FindBy(id="email")
	private WebElement email;
	//To enter the Password
	@FindBy(id="passwd")	
	private WebElement Password;
	//To enter the company name
	@FindBy(id="company")
	private WebElement company;
	//to enter the Address
	@FindBy(id="address1")
	private WebElement address;
	//To enter the address2
	@FindBy(id="address2")
	private WebElement addressTwo;
	//To enter the city	
	@FindBy(id="city")
	private WebElement city;
	//to enter the phno
	@FindBy(id="phone")
	private WebElement homeNo;
	//To enter the 	
	@FindBy(id="phone_mobile")
	private WebElement phNO;
	/**
	 * @return the sigin
	 */
	public WebElement getSigin() {
		return sigin;
	}
	/**
	 * @param sigin the sigin to set
	 */
	public void setSigin(WebElement sigin) {
		this.sigin = sigin;
	}
	/**
	 * @return the emailAddress
	 */
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the createAccount
	 */
	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	/**
	 * @param createAccount the createAccount to set
	 */
	public void setCreateAccount(WebElement createAccount) {
		CreateAccount = createAccount;
	}
	/**
	 * @return the gender
	 */
	public WebElement getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(WebElement email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(WebElement password) {
		Password = password;
	}
	/**
	 * @return the company
	 */
	public WebElement getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(WebElement company) {
		this.company = company;
	}
	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(WebElement address) {
		this.address = address;
	}
	/**
	 * @return the addressTwo
	 */
	public WebElement getAddressTwo() {
		return addressTwo;
	}
	/**
	 * @param addressTwo the addressTwo to set
	 */
	public void setAddressTwo(WebElement addressTwo) {
		this.addressTwo = addressTwo;
	}
	/**
	 * @return the city
	 */
	public WebElement getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(WebElement city) {
		this.city = city;
	}
	/**
	 * @return the homeNo
	 */
	public WebElement getHomeNo() {
		return homeNo;
	}
	/**
	 * @param homeNo the homeNo to set
	 */
	public void setHomeNo(WebElement homeNo) {
		this.homeNo = homeNo;
	}
	/**
	 * @return the phNO
	 */
	public WebElement getPhNO() {
		return phNO;
	}
	/**
	 * @param phNO the phNO to set
	 */
	public void setPhNO(WebElement phNO) {
		this.phNO = phNO;
	}
	
	
	
	
	
	
	

	
	
}
