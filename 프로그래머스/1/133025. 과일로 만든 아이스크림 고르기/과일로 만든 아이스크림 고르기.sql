-- 코드를 입력하세요
SELECT a.FLAVOR as FLAVOR
FROM FIRST_HALF as a
    inner join ICECREAM_INFO as b on a.FLAVOR = b.FLAVOR
where TOTAL_ORDER > 3000
and INGREDIENT_TYPE = 'fruit_based'