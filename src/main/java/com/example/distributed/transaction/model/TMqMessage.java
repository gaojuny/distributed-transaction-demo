package com.example.distributed.transaction.model;

import java.io.Serializable;
import java.util.Date;

/**
 * t_mq_message
 * @author 
 */
public class TMqMessage implements Serializable {
    private Long id;

    /**
     * 业务id
     */
    private Long bizId;

    /**
     * 业务类型
     */
    private Byte bizType;

    /**
     * 消息结果(0:成功,1:失败,2:处理中)
     */
    private Byte msgResult;

    /**
     * 消息描述
     */
    private String msgDesc;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 重试次数
     */
    private Integer tryCount;

    /**
     * 消息内容
     */
    private String msg;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Byte getBizType() {
        return bizType;
    }

    public void setBizType(Byte bizType) {
        this.bizType = bizType;
    }

    public Byte getMsgResult() {
        return msgResult;
    }

    public void setMsgResult(Byte msgResult) {
        this.msgResult = msgResult;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getTryCount() {
        return tryCount;
    }

    public void setTryCount(Integer tryCount) {
        this.tryCount = tryCount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TMqMessage other = (TMqMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBizId() == null ? other.getBizId() == null : this.getBizId().equals(other.getBizId()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getMsgResult() == null ? other.getMsgResult() == null : this.getMsgResult().equals(other.getMsgResult()))
            && (this.getMsgDesc() == null ? other.getMsgDesc() == null : this.getMsgDesc().equals(other.getMsgDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getTryCount() == null ? other.getTryCount() == null : this.getTryCount().equals(other.getTryCount()))
            && (this.getMsg() == null ? other.getMsg() == null : this.getMsg().equals(other.getMsg()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBizId() == null) ? 0 : getBizId().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getMsgResult() == null) ? 0 : getMsgResult().hashCode());
        result = prime * result + ((getMsgDesc() == null) ? 0 : getMsgDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getTryCount() == null) ? 0 : getTryCount().hashCode());
        result = prime * result + ((getMsg() == null) ? 0 : getMsg().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bizId=").append(bizId);
        sb.append(", bizType=").append(bizType);
        sb.append(", msgResult=").append(msgResult);
        sb.append(", msgDesc=").append(msgDesc);
        sb.append(", createTime=").append(createTime);
        sb.append(", tryCount=").append(tryCount);
        sb.append(", msg=").append(msg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}