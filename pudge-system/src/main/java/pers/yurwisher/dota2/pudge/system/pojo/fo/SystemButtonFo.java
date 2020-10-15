package pers.yurwisher.dota2.pudge.system.pojo.fo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import pers.yurwisher.dota2.pudge.validator.annotation.DataIn;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * @author yq
 * @date 2020-09-26 11:35:17
 * @description 按钮 Fo
 * @since V1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SystemButtonFo implements Serializable {
    private static final long serialVersionUID = 5529749010150803094L;
    @NotBlank(message = "按钮名称必填")
    private String buttonName;
    @NotNull(message = "按钮所属菜单必填")
    private Long menuId;
    @Positive(message = "按钮排序号必须大于0")
    private Integer sortNo;
    private String icon;
    @DataIn(message = "无效按钮位置",dataList = {"TOP","ROW","OTHER"})
    private String position;
    @NotBlank(message = "按钮绑定函数必填")
    private String click;
    private String permission;
}
