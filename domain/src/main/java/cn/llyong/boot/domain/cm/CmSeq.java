package cn.llyong.boot.domain.cm;

import java.io.Serializable;
import java.util.Date;

public class CmSeq implements Serializable {
    private String seqType;

    private String seqTypeDesc;

    private String seqHead;

    private Integer seqLength;

    private Long curSeqNo;

    private Long minValue;

    private Long maxValue;

    private Integer status;

    private String creater;

    private Date createTime;

    private String modifier;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getSeqType() {
        return seqType;
    }

    public void setSeqType(String seqType) {
        this.seqType = seqType == null ? null : seqType.trim();
    }

    public String getSeqTypeDesc() {
        return seqTypeDesc;
    }

    public void setSeqTypeDesc(String seqTypeDesc) {
        this.seqTypeDesc = seqTypeDesc == null ? null : seqTypeDesc.trim();
    }

    public String getSeqHead() {
        return seqHead;
    }

    public void setSeqHead(String seqHead) {
        this.seqHead = seqHead == null ? null : seqHead.trim();
    }

    public Integer getSeqLength() {
        return seqLength;
    }

    public void setSeqLength(Integer seqLength) {
        this.seqLength = seqLength;
    }

    public Long getCurSeqNo() {
        return curSeqNo;
    }

    public void setCurSeqNo(Long curSeqNo) {
        this.curSeqNo = curSeqNo;
    }

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqType=").append(seqType);
        sb.append(", seqTypeDesc=").append(seqTypeDesc);
        sb.append(", seqHead=").append(seqHead);
        sb.append(", seqLength=").append(seqLength);
        sb.append(", curSeqNo=").append(curSeqNo);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", status=").append(status);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}