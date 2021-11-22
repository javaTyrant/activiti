package boot.spring.po;

import lombok.Data;
import org.activiti.engine.task.Task;

import java.math.BigDecimal;

@Data
public class PurchaseApply {
    /**
     *
     */
    Integer id;
    /**
     *
     */
    String itemlist;
    /**
     *
     */
    BigDecimal total;
    /**
     *
     */
    String applytime;
    /**
     *
     */
    String applyer;
    /**
     *
     */
    Task task;
    /**
     *
     */
    String processinstanceid;
    /**
     *
     */
    String activityid;
    /**
     *
     */
    String state;

}
