public abstract class Peminjam implements UserLogin {

    private boolean isLogin;
    private boolean isAntiDenda;

    @Override
    public void doLogin(){
        System.out.println("Peminjam berhasil login");
        isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam berhasil logout");
        isLogin = false;
    }

    @Override
    public boolean isLogin(){
        return isLogin;
    }

    public void addAntiDenda(){
        System.out.println("Denda dihapuskan");
    }

    public void removeAntiDenda(){
        System.out.println("Denda dihilangkan");
    }

    public boolean getAntiDenda(){
        return isAntiDenda;
    }


    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String namaPeminjam);
    public abstract String getNamaPeminjam(); 

}
