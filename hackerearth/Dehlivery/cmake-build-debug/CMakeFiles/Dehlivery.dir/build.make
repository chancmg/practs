# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.7

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2017.1.2\bin\cmake\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2017.1.2\bin\cmake\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\Dev\pract\hackerearth\Dehlivery

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Dehlivery.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Dehlivery.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Dehlivery.dir/flags.make

CMakeFiles/Dehlivery.dir/main.cpp.obj: CMakeFiles/Dehlivery.dir/flags.make
CMakeFiles/Dehlivery.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Dehlivery.dir/main.cpp.obj"
	C:\MinGW\bin\g++.exe   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Dehlivery.dir\main.cpp.obj -c D:\Dev\pract\hackerearth\Dehlivery\main.cpp

CMakeFiles/Dehlivery.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Dehlivery.dir/main.cpp.i"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E D:\Dev\pract\hackerearth\Dehlivery\main.cpp > CMakeFiles\Dehlivery.dir\main.cpp.i

CMakeFiles/Dehlivery.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Dehlivery.dir/main.cpp.s"
	C:\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S D:\Dev\pract\hackerearth\Dehlivery\main.cpp -o CMakeFiles\Dehlivery.dir\main.cpp.s

CMakeFiles/Dehlivery.dir/main.cpp.obj.requires:

.PHONY : CMakeFiles/Dehlivery.dir/main.cpp.obj.requires

CMakeFiles/Dehlivery.dir/main.cpp.obj.provides: CMakeFiles/Dehlivery.dir/main.cpp.obj.requires
	$(MAKE) -f CMakeFiles\Dehlivery.dir\build.make CMakeFiles/Dehlivery.dir/main.cpp.obj.provides.build
.PHONY : CMakeFiles/Dehlivery.dir/main.cpp.obj.provides

CMakeFiles/Dehlivery.dir/main.cpp.obj.provides.build: CMakeFiles/Dehlivery.dir/main.cpp.obj


# Object files for target Dehlivery
Dehlivery_OBJECTS = \
"CMakeFiles/Dehlivery.dir/main.cpp.obj"

# External object files for target Dehlivery
Dehlivery_EXTERNAL_OBJECTS =

Dehlivery.exe: CMakeFiles/Dehlivery.dir/main.cpp.obj
Dehlivery.exe: CMakeFiles/Dehlivery.dir/build.make
Dehlivery.exe: CMakeFiles/Dehlivery.dir/linklibs.rsp
Dehlivery.exe: CMakeFiles/Dehlivery.dir/objects1.rsp
Dehlivery.exe: CMakeFiles/Dehlivery.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Dehlivery.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Dehlivery.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Dehlivery.dir/build: Dehlivery.exe

.PHONY : CMakeFiles/Dehlivery.dir/build

CMakeFiles/Dehlivery.dir/requires: CMakeFiles/Dehlivery.dir/main.cpp.obj.requires

.PHONY : CMakeFiles/Dehlivery.dir/requires

CMakeFiles/Dehlivery.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Dehlivery.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Dehlivery.dir/clean

CMakeFiles/Dehlivery.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\Dev\pract\hackerearth\Dehlivery D:\Dev\pract\hackerearth\Dehlivery D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug D:\Dev\pract\hackerearth\Dehlivery\cmake-build-debug\CMakeFiles\Dehlivery.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Dehlivery.dir/depend

