package ex01;

class SendMessage {
    private String msg;
    
    public SendMessage(String msg) { this.msg = msg; }
    
    public String getMsg() { return msg; }
}

class Network {
    
    public void message(String content) {
        SendMessage msg = new SendMessage(content);
        System.out.println(msg.getMsg());
    }
}

public class NonStaticNested2 {
    
    public static void main(String[] args) {
        Network network = new Network();

        network.message("전송할 데이타 입니다");
    }
}