package lotto.view;

public class RequestMessage {
    private static final String TOTAL_PRICE = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUM = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUM = "보너스 번호를 입력해 주세요.";

    public void requestTotalPrice(){
        System.out.println(TOTAL_PRICE);
    }

    public void requestWinningNum(){
        System.out.println(WINNING_NUM);
    }

    public void requestBonusNum() {
        System.out.println(BONUS_NUM);
    }
}
