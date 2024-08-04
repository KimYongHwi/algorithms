package com.kyh.algorithms.lv1

class 옹알이2 {
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        for (i in babbling.indices) {
            if (babbling[i].contains("ayaaya")
                || babbling[i].contains("yeye")
                || babbling[i].contains("woowoo")
                || babbling[i].contains("mama")
            ) {
                continue
            }

            /*
             * yayae 같은 케이스의 경우 ""로 replace 할 경우 aya를 replace하고
             * 남은 ye때문에 counting이 올라갈 수 있다.
             */
            babbling[i] = babbling[i].replace("aya", " ")
            babbling[i] = babbling[i].replace("ye", " ")
            babbling[i] = babbling[i].replace("woo", " ")
            babbling[i] = babbling[i].replace("ma", " ")
            babbling[i] = babbling[i].replace(" ", "")

            if (babbling[i].isEmpty()) answer++
        }

        return answer
    }
}
