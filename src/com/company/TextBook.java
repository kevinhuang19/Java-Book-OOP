package com.company;

class TextBook extends Book{//sub class of book
    private String subject;
    private String title;
    private int edition;
    private boolean Ebook;
    private double ePrice;
    public TextBook(){
        super();
        subject="No Subject";//pre set to no subject
    }
    public TextBook(String isbn,String title,int edition,String subject){//constructor
        super(isbn,title,edition);
        this.subject=subject;
    }
    //getter and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEbook() {
        return Ebook;
    }

    public void setEbook(boolean ebook) {
        Ebook = ebook;
    }
    public double getePrice(){
        return ePrice;
    }
    public void setePrice(double ePrice){
        this.ePrice=ePrice;
    }
    public void adjustTitle(){
        setTitle(getTitle()+"(TextBook)");
    }
    public String toString() {
        return super.toString()+"Subject: "+subject+"\nebook:"+ePrice+"ePrice:"+ePrice+"\n";
    }
}