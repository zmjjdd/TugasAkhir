class Menu {
    private String menuid;
    private String menuname;
    private Double price;
    

    public Menu( String menuid, String menuname, Double price){
        this.menuid = menuid;
        this.menuname = menuname;
        this.price = price;
    }

    public String getmenuid() {
        return menuid;
    }

    public String getmenuname() {
        return menuname;
    }
    
   public Double getprice() {
        return price;
}