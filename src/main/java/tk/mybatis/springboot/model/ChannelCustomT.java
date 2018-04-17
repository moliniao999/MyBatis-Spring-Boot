package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "channel_custom_t")
public class ChannelCustomT {
    @Id
    @Column(name = "channel_id")
    private String channelId;

    /**
     * 渠道状态，1-有效，2-无效
     */
    @Column(name = "channel_status")
    private Integer channelStatus;

    /**
     * 渠道名称
     */
    @Column(name = "channel_name")
    private String channelName;

    /**
     * 下线原因编号
     */
    @Column(name = "off_reason_id")
    private Integer offReasonId;

    /**
     * 渠道类型，1-直销渠道，2-分销渠道
     */
    @Column(name = "channel_type")
    private Integer channelType;

    /**
     * 自主进件开关，0：关闭，1：开启
     */
    @Column(name = "auto_switch")
    private String autoSwitch;

    /**
     * 域名
     */
    private String domain;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * （1:其他渠道,2:全通渠道,3:自有渠道）
     */
    @Column(name = "group_type")
    private Integer groupType;

    /**
     * 授信合同名义利率
     */
    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    /**
     * 是否支持委托保证利率：0 - 不支持 1 - 支持
     */
    @Column(name = "assure_rate_isSupport")
    private Byte assureRateIssupport;

    /**
     * 委托保证利率
     */
    @Column(name = "assure_rate")
    private BigDecimal assureRate;

    /**
     * @return channel_id
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取渠道状态，1-有效，2-无效
     *
     * @return channel_status - 渠道状态，1-有效，2-无效
     */
    public Integer getChannelStatus() {
        return channelStatus;
    }

    /**
     * 设置渠道状态，1-有效，2-无效
     *
     * @param channelStatus 渠道状态，1-有效，2-无效
     */
    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * 获取渠道名称
     *
     * @return channel_name - 渠道名称
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置渠道名称
     *
     * @param channelName 渠道名称
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * 获取下线原因编号
     *
     * @return off_reason_id - 下线原因编号
     */
    public Integer getOffReasonId() {
        return offReasonId;
    }

    /**
     * 设置下线原因编号
     *
     * @param offReasonId 下线原因编号
     */
    public void setOffReasonId(Integer offReasonId) {
        this.offReasonId = offReasonId;
    }

    /**
     * 获取渠道类型，1-直销渠道，2-分销渠道
     *
     * @return channel_type - 渠道类型，1-直销渠道，2-分销渠道
     */
    public Integer getChannelType() {
        return channelType;
    }

    /**
     * 设置渠道类型，1-直销渠道，2-分销渠道
     *
     * @param channelType 渠道类型，1-直销渠道，2-分销渠道
     */
    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    /**
     * 获取自主进件开关，0：关闭，1：开启
     *
     * @return auto_switch - 自主进件开关，0：关闭，1：开启
     */
    public String getAutoSwitch() {
        return autoSwitch;
    }

    /**
     * 设置自主进件开关，0：关闭，1：开启
     *
     * @param autoSwitch 自主进件开关，0：关闭，1：开启
     */
    public void setAutoSwitch(String autoSwitch) {
        this.autoSwitch = autoSwitch;
    }

    /**
     * 获取域名
     *
     * @return domain - 域名
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置域名
     *
     * @param domain 域名
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取（1:其他渠道,2:全通渠道,3:自有渠道）
     *
     * @return group_type - （1:其他渠道,2:全通渠道,3:自有渠道）
     */
    public Integer getGroupType() {
        return groupType;
    }

    /**
     * 设置（1:其他渠道,2:全通渠道,3:自有渠道）
     *
     * @param groupType （1:其他渠道,2:全通渠道,3:自有渠道）
     */
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    /**
     * 获取授信合同名义利率
     *
     * @return interest_rate - 授信合同名义利率
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * 设置授信合同名义利率
     *
     * @param interestRate 授信合同名义利率
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * 获取是否支持委托保证利率：0 - 不支持 1 - 支持
     *
     * @return assure_rate_isSupport - 是否支持委托保证利率：0 - 不支持 1 - 支持
     */
    public Byte getAssureRateIssupport() {
        return assureRateIssupport;
    }

    /**
     * 设置是否支持委托保证利率：0 - 不支持 1 - 支持
     *
     * @param assureRateIssupport 是否支持委托保证利率：0 - 不支持 1 - 支持
     */
    public void setAssureRateIssupport(Byte assureRateIssupport) {
        this.assureRateIssupport = assureRateIssupport;
    }

    /**
     * 获取委托保证利率
     *
     * @return assure_rate - 委托保证利率
     */
    public BigDecimal getAssureRate() {
        return assureRate;
    }

    /**
     * 设置委托保证利率
     *
     * @param assureRate 委托保证利率
     */
    public void setAssureRate(BigDecimal assureRate) {
        this.assureRate = assureRate;
    }
}