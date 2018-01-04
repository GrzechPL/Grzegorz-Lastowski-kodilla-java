-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: kodilla_course
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `books_and_readers`
--

DROP TABLE IF EXISTS `books_and_readers`;
/*!50001 DROP VIEW IF EXISTS `books_and_readers`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `books_and_readers` AS SELECT 
 1 AS `reader_id`,
 1 AS `firstname`,
 1 AS `lastname`,
 1 AS `title`,
 1 AS `rent_date`,
 1 AS `return_date`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `bestsellers_count`
--

DROP TABLE IF EXISTS `bestsellers_count`;
/*!50001 DROP VIEW IF EXISTS `bestsellers_count`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `bestsellers_count` AS SELECT 
 1 AS `counter`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `books_and_readers`
--

/*!50001 DROP VIEW IF EXISTS `books_and_readers`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`kodilla_user`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `books_and_readers` AS select `rd`.`READER_ID` AS `reader_id`,`rd`.`FIRSTNAME` AS `firstname`,`rd`.`LASTNAME` AS `lastname`,`bk`.`TITLE` AS `title`,`rt`.`RENT_DATE` AS `rent_date`,`rt`.`RETURN_DATE` AS `return_date` from ((`readers` `rd` join `books` `bk`) join `rents` `rt`) where ((`rt`.`BOOK_ID` = `bk`.`BOOK_ID`) and (`rt`.`READER_ID` = `rd`.`READER_ID`)) order by `rt`.`RENT_DATE` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `bestsellers_count`
--

/*!50001 DROP VIEW IF EXISTS `bestsellers_count`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `bestsellers_count` AS select count(0) AS `counter` from `books` where (`books`.`bestseller` = 1) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping events for database 'kodilla_course'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `update_best` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8 */ ;;
/*!50003 SET character_set_results = utf8 */ ;;
/*!50003 SET collation_connection  = utf8_general_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `update_best` ON SCHEDULE EVERY 1 MINUTE STARTS '2018-01-05 00:04:56' ON COMPLETION NOT PRESERVE ENABLE DO begin
call UpdateBestSellers();
insert into stats(stat_date, stat, value)
	values (curdate(), "bestseller", bestsellers_count);

end */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;

--
-- Dumping routines for database 'kodilla_course'
--
/*!50003 DROP FUNCTION IF EXISTS `CheckBestseller` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`kodilla_user`@`localhost` FUNCTION `CheckBestseller`(BOOK_RENTS INT) RETURNS tinyint(1)
    DETERMINISTIC
BEGIN
	DECLARE RESULT boolean;
    if BOOK_RENTS >2 then
    set result = true;
    else 
    set result = false;
    end if;
    return result;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP FUNCTION IF EXISTS `VipLevel` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`kodilla_user`@`localhost` FUNCTION `VipLevel`(booksrented int) RETURNS varchar(20) CHARSET utf8
    DETERMINISTIC
begin
	declare result varchar(20) default 'Standard customer';
    if booksrented >=10 then
		set result = 'Gold customer';
    elseif booksrented >= 5 and booksrented < 10 then
      set result = 'Silver customer';
    elseif booksrented >= 2 and booksrented < 5 then
      set result = 'Bronze customer';
    else
		set result = 'Standard customer';
	end if;
    return result;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `UpdateBestsellers` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`kodilla_user`@`localhost` PROCEDURE `UpdateBestsellers`()
BEGIN
DECLARE BOOK_RENTS, B_ID INT;
declare FINISHED INT DEFAULT 0;
declare ALL_BOOKS cursor for select BOOK_ID FROM BOOKS;
declare continue handler for not found set FINISHED = 1;

OPEN ALL_BOOKS;
while (FINISHED = 0) DO
fetch ALL_BOOKS into B_ID;
if (FINISHED = 0) THEN

SET BOOK_RENTS = (SELECT COUNT(*) FROM RENTS WHERE BOOK_ID = B_ID GROUP BY MONTH(RENT_DATE) );

UPDATE BOOKS SET BESTSELLER = CheckBestseller(BOOK_RENTS) WHERE BOOK_ID = B_ID;
COMMIT;
END IF;
END WHILE; 
CLOSE ALL_BOOKS;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `UpdateVipLevels` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`kodilla_user`@`localhost` PROCEDURE `UpdateVipLevels`()
begin
	declare booksread, days, rdr_id int;
    declare bookspermonth decimal(5,2);
	declare finished int default 0;
    declare all_readers cursor for select reader_id from readers;
    declare continue handler for not found set finished = 1;
	open all_readers;
    while(finished = 0) do
		fetch all_readers into rdr_id;
        if (finished = 0) then
			select count(*) from rents
            where reader_id = rdr_id
             into booksread;
			select datediff(max(RENT_DATE), min(RENT_DATE)) +1 from rents
			where READER_ID = rdr_id
			into days;
			set bookspermonth = booksread / days * 30;
            update readers set VIP_LEVEL = VipLevel(bookspermonth)
			where READER_ID = rdr_id;
			commit;
		end if;
	end while;
    close all_readers;
    end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-05  0:10:04
