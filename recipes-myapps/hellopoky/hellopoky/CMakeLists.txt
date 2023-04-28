project(hellopoky C)
cmake_minimum_required(VERSION 2.6.3)

add_executable (hellopoky main.c)

install(TARGETS hellopoky DESTINATION ${CMAKE_INSTALL_PREFIX}/bin)
