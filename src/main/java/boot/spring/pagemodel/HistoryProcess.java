package boot.spring.pagemodel;

import boot.spring.po.LeaveApply;
import boot.spring.po.PurchaseApply;
import lombok.Data;

@Data
public class HistoryProcess {
    /**
     *
     */
    String processDefinitionId;
    /**
     *
     */
    String businessKey;
    /**
     *
     */
    LeaveApply leaveapply;
    /**
     *
     */
    PurchaseApply purchaseapply;
}
