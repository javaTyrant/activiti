package boot.spring.pagemodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("请假任务信息")
public class LeaveTask {
    @ApiModelProperty("主键")
    Integer id;
    @ApiModelProperty("流程实例id")
    String process_instance_id;
    @ApiModelProperty("用户名")
    String user_id;
    @ApiModelProperty("请假起始时间")
    String start_time;
    @ApiModelProperty("请假结束时间")
    String end_time;
    @ApiModelProperty("请假类型")
    String leave_type;
    @ApiModelProperty("请假原因")
    String reason;
    @ApiModelProperty("申请时间")
    String apply_time;
    @ApiModelProperty("实际请假起始时间")
    String reality_start_time;
    @ApiModelProperty("实际请假结束时间")
    String reality_end_time;
    @ApiModelProperty("任务id")
    String taskid;
    @ApiModelProperty("任务名")
    String taskname;
    @ApiModelProperty("流程实例id")
    String processinstanceid;
    @ApiModelProperty("流程定义id")
    String processdefid;
    @ApiModelProperty("任务创建时间")
    Date taskcreatetime;

}
