package com.ht.manage.common.model;

/**
 * All rights Reserved, Designed By www.whdata.com
 *
 * @version V1.0
 * @Title: epf-api
 * @Package com.uupf.common.model
 * @author: wangtz
 * 业务状态码
 * @date: 2018/5/15 9:31 PM
 * @Copyright: 2018 www.whdata.com Inc. All rights reserved.
 */
public enum ResCode {


    /**
     * token异常
     */
    TOKEN_EXPIRED(700, "token过期"),
    TOKEN_ERROR(700, "token验证失败"),
    TOKEN_METHORD_NOTSOUPPORT(700, "请求方法有误"),
    /**
     * 签名异常
     */
    SIGN_ERROR(700, "签名验证失败"),

    PARAM_VALIDAT_ERROR(600, "请求参数验证失败"),

    /**
     * 文件上传
     */
    FILE_READING_ERROR(4001, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(4002, "FILE_NOT_FOUND!"),
    UPLOAD_ERROR(500, "上传图片出错"),

    /**
     * 其他
     */
    AUTH_REQUEST_ERROR(400, "账号密码错误"),
    not_ermission(401, "当前角色无权限"),


    business_exception(40001, "业务异常"),
    success(100000, "成功"),
    failed(100001, "失败"),
    phone_not_exist(100002, "当前手机号未注册"),
    login_success(100003, "登陆成功"),
    login_failed(100004, "登陆失败"),
    miyao_is_null(100009, "通过手机号未获取到密钥"),
    decode_pwd_error(100008, "密码解密失败"),
    input_error_pwd(100005, "密码输入错误"),
    phone_already_exist(100006, "当前手机号已经注册"),
    registry_success(100007, "注册成功"),
    smscode_failed(100010, "验证码有误"),
    smscode_success(100011, "验证成功"),
    parameter_error(100013, "参数错误"),
    parameter_null(100014, "参数为空"),
    nvalid_phone_number(100015, "无效的手机号"),
    many_send_message(100016, "请在10分钟后再次获取新的验证码"),
    smscode_expire(100017, "验证码过期"),
    user_not_exist(100018, "用户不存在"),
    user_not_exist_auth(100020, "当前用户不存在认证信息"),
    order_not_exist(100023, "订单不存在"),
    not_bind_phone(100025, "未绑定手机号"),
    create_token_error(100026, "创建token失败"),
    wechat_code_error(100027, "微信code错误"),
    send_smscode_error(100028, "验证码发送失败"),
    user_id_is_null(100029, "用户ID为空"),
    order_price_is_null(100031, "订单金额为空"),
    pay_price_is_null(100032, "支付金额为空"),
    pay_type_is_null(100033, "支付方式为空"),
    order_not_received(100036, "订单已经被接单"),
    not_again_apply(100038, "退款申请已存在"),
    unbind_wchant(100039, "请先绑定微信"),
    tx_failed(100040, "提现失败，请联系管理员"),
    tx_check_failed(100041, "提现校验失败"),
    student_aleady_exist(100042, "学生已经存在"),

    //im
    net_easy_error(414, "im账号有误"),
    im_not_login(415, "im账号未请求登陆"),

    user_registed(100043, "该手机号已注册，请返回登陆"),
    not_class_hour(100044, "抱歉，您购买课时已用完，请重新下单购买课时"),
    group_faile(100045, "拼单失败"),
    can_not_booking(100046, "拼单发起者才可以预约上课"),
    current_order_commentd(100047, "您已评价过该订单"),
    can_not_create_room(100048, "老师还未开始上课"),
    wallet_account_error(100049, "钱包账户存在异常"),
    not_sufficient_funds(100050, "余额不足"),
    you_joined_order(100051, "您已参与了该拼单"), class_used_up(100052, "当前订单已无课时，请重新下单"),
    teahcer_is_auth(100053, "教师在审核中"),
    not_bind_wx(100054,"当前账号未绑定微信");
    private Integer code;
    private String msg;

    ResCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String msg() {
        return msg;
    }

    public Integer code() {
        return code;
    }

}
