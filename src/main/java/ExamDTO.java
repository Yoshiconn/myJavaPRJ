import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExamDTO { // 데이터를 전송할때 방식을 DTO 라고함

    private String test;
    private int score;
}