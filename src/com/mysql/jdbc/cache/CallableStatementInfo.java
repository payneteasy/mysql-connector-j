package com.mysql.jdbc.cache;

import com.mysql.jdbc.CallableStatement;

/**
 *
 */
public class CallableStatementInfo {

    public CallableStatementInfo(int parameterCount, CallableStatement.CallableStatementParamInfo paramInfo, int[] placeholderToParameterIndexMap) {
        this.parameterCount = parameterCount;
        this.paramInfo = paramInfo;
        this.placeholderToParameterIndexMap = placeholderToParameterIndexMap;
    }

    public final int parameterCount;
    public final CallableStatement.CallableStatementParamInfo paramInfo;
    public final int[] placeholderToParameterIndexMap;

}
