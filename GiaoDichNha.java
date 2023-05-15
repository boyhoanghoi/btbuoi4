   package baitapquanlynhadat;
public class GiaoDichNha extends GiaoDich{
    private String loaiNha, diaChi;
    private int choose;
    public GiaoDichNha(){
        super();
    }
    public GiaoDichNha(String loaiNha, String diaChi){
        super();
        this.loaiNha= loaiNha;
        this.diaChi= diaChi;
    }
    public String getLoaiNha(){
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha){
        this.loaiNha = loaiNha;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public void nhap(){
        super.nhap();
        System.out.print("Nhap dia chi:");
        diaChi = scanner.nextLine();
        System.out.print("Nhap loai nha:");
        choose= scanner.nextInt();
        switch (choose){
            case 0:
            loaiNha = "cao cap";
            break;
            case 1:
            loaiNha = "thuong";
            break;
            default:
            System.out.println("Chon so khong hop le");
            break;
        }
    }
    @Override
    public String toString(){
        return super.toString()+", loai nhà "+ this.loaiNha +", địa chỉ: " + this.diaChi;
    }
}