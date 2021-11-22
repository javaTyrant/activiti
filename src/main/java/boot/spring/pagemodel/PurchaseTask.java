package boot.spring.pagemodel;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseTask {
    Integer bussinesskey;
    String applyer;
    String itemlist;
    BigDecimal total;
    String applytime;
    String taskid;
    String taskname;
    String processinstanceid;
    String processdefid;
}
