package actions.views;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *従業員情報について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter // 全てのクラスフィールドについてgetterを自動生成する(Lombok)
@Setter // 全てのクラスフィールドについてsetterを自動生成する(Lombok)
@NoArgsConstructor // 引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor // 全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する(Lombok)
public class EmployeeView {


    /**
     * id
     */
    private Integer id;


    /**
     * 社員番号
     */
    private String code;


    /**
     * 氏名
     */
    private String name;


    /**
     * パスワード
     */
    private String password;


    /**
     * 管理権限があるかどうか（一般：０、管理者：１）
     */
    private Integer adminFlag;


    /**
     * 登録日時
     */
    private LocalDateTime createdAt;


    /**
     * 更新日時
     */
    private LocalDateTime updatedAt;


    /**
     * 削除されたかどうか（現役：０、削除済み：１）
     */
    private Integer deleteFlag;

}
