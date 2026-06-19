package d5.p27;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Vector 컬렉션 생성 (Board 객체 여러 개를 담을 수 있는 상자)
        List<Board> list = new Vector<Board>();

        // Board 객체 추가 (인덱스 0 ~ 4)
        list.add(new Board("제목1", "내용1")); // [0]
        list.add(new Board("제목2", "내용2")); // [1]
        list.add(new Board("제목3", "내용3")); // [2]
        list.add(new Board("제목4", "내용4")); // [3]
        list.add(new Board("제목5", "내용5")); // [4]

        // 객체 삭제 프로세스
        list.remove(2); // 1번째 삭제: 2번 인덱스("제목3") 삭제 -> 뒤의 객체들이 한 칸씩 당겨짐
        list.remove(3); // 2번째 삭제: 당겨진 상태에서 현재 3번 인덱스("제목5") 삭제

        // 결과 출력
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subject + "\t" + board.content);
        }
    }
}

// 게시글 정보를 담을 Board 클래스 정의
class Board {
    String subject;
    String content;

    public Board(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }
}