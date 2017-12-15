package com.overview.parameterizetest_10;

/**
 * Created by renwujie on 2017/12/15 at 15:26
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
