package st.asojuku.ac.jp.study3_1;

/**
 * Created by Itchy on 2016/09/09.
 */
public class AnbayasiData {
    private int number;
    private int addition;
    private String comment;

    public AnbayasiData(int number,int addition,String comment){
        this.number=number;
        this.addition=addition;
        this.comment=comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return addition;
    }

    public String getComment() {
        return comment;
    }

}
